package tests.javafuzzer2449;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:49:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3819174505L;
    public static int iFld=-8;
    public static byte byFld=78;
    public static float fFld=0.605F;
    public static double dFld=-60.46368;
    public static short sFld=6354;
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)66);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i2=2, i3=67, i4=227, i5=-37484, iArr[]=new int[N];
        float fArr[][]=new float[N][N];
        short sArr[]=new short[N];

        FuzzerUtils.init(fArr, -90.175F);
        FuzzerUtils.init(iArr, -28);
        FuzzerUtils.init(sArr, (short)-28029);

        fArr[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] *= Test.byFld;
        Test.iFld = 0;
        Test.iFld *= Test.iFld;
        Test.iFld -= 22;
        Test.fFld = Test.fFld;
        Test.instanceCount = Test.instanceCount;
        iArr[(Test.iFld >>> 1) % N] -= -16493;
        for (i2 = 4; 277 > i2; i2++) {
            i4 = 1;
            while (++i4 < 6) {
                i5 = 1;
                while (++i5 < 1) {
                    sArr[i4] += (short)i2;
                    i3 = (int)Test.fFld;
                    iArr[i4 + 1] = Test.iFld;
                    Test.instanceCount = -15601;
                }
                iArr[i4 - 1] *= 8281;
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l1) {

        float f=-98.365F;
        int i6=-14, i7=-11, i8=-31, i9=2, i10=-195, iArr1[]=new int[N];
        double d=0.5529;
        boolean b=true;

        FuzzerUtils.init(iArr1, -2);

        l1 += ((long)(Test.byFld = (byte)(Test.iFld - f)) >>> (iMeth() + Test.instanceCount));
        for (i6 = 10; i6 < 221; i6++) {
            for (i8 = 8; i8 > 1; i8 -= 2) {
                for (d = 3; d > i6; d -= 2) {
                    Test.byArrFld[(int)(d + 1)] = (byte)Test.iFld;
                    i7 *= (int)-34385L;
                    i10 += (int)d;
                    Test.dFld = Test.fFld;
                    i10 = 33296;
                    iArr1[i8] -= Test.byFld;
                    if (b) {
                        i10 *= i8;
                        Test.instanceCount = 3;
                    } else {
                        b = b;
                    }
                    Test.sFld -= Test.byFld;
                }
            }
        }
        vMeth1_check_sum += l1 + Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + i10 + (b ?
            1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(long l) {

        int i=-37299, i1=-14, i11=11, i12=164, i13=0, i14=-47376, iArr2[]=new int[N];
        boolean b1=true;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -24.926F);
        FuzzerUtils.init(iArr2, 1);

        i = 1;
        while (++i < 374) {
            Test.iFld = i;
            i1 = 1;
            do {
                Test.iFld = Test.iFld;
                vMeth1(l);
                fArr1[i1 + 1] -= Test.iFld;
            } while (++i1 < 5);
            for (i11 = 5; i11 > 1; i11 -= 2) {
                i12 += (-35990 + (i11 * i11));
                Test.iFld += (((i11 * l) + Test.instanceCount) - i12);
            }
            fArr1[i - 1] %= (i1 | 1);
            for (i13 = i; 5 > i13; ++i13) {
                if (b1) {
                    if (true) continue;
                    i12 = i12;
                    iArr2[i13 - 1] -= i1;
                } else {
                    Test.dFld -= 70;
                }
            }
        }
        vMeth_check_sum += l + i + i1 + i11 + i12 + i13 + i14 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {


        vMeth(Test.instanceCount);



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
