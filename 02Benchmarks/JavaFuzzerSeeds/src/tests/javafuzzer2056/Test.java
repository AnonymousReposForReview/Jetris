package tests.javafuzzer2056;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 08:12:48 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-1486708194L;
    public static short sFld=-29466;
    public static double dFld=1.38211;
    public static volatile float fFld=1.1014F;
    public byte byFld=121;
    public static long lArrFld[]=new long[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 158959819L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vSmallMeth(int i, int i1) {


        i = (int)(i1 - ((i--) * (Test.instanceCount - Test.sFld)));
        vSmallMeth_check_sum += i + i1;
    }

    public static void vMeth1(int i3, int i4) {

        int i5=-1078, i6=36831, i7=204, i8=-13, iArr1[]=new int[N];
        long l1=-8L;

        FuzzerUtils.init(iArr1, -50570);

        i4 = (int)((-(-7 * (Test.instanceCount + i3))) << (iArr1[(i3 >>> 1) % N]--));
        i4 |= -51258;
        for (i5 = 7; i5 < 366; ++i5) {
            i3 += i5;
            try {
                iArr1[i5 - 1] = (i5 % 2);
                i3 = (-184 / i3);
                i3 = (-41 % iArr1[i5]);
            } catch (ArithmeticException a_e) {}
            vSmallMeth(i3, -16138);
            i3 |= Test.sFld;
            l1 = 1;
            while ((l1 += 3) < 5) {
                iArr1[i5 + 1] = i3;
            }
            i6 = (int)l1;
            i3 += i5;
            Test.instanceCount += (-238 + (i5 * i5));
            for (i7 = 5; i7 > 1; --i7) {
                i4 = (int)Test.instanceCount;
                iArr1[i5 + 1] = (int)-118L;
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + l1 + i7 + i8 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(long l) {

        int i9=14, i10=30284, i11=155, i12=253, iArr2[]=new int[N];
        byte by=15;
        boolean b=false;

        FuzzerUtils.init(iArr2, -130);

        vMeth1(i9, i9);
        Test.dFld = Test.sFld;
        iArr2[(i9 >>> 1) % N] = Test.sFld;
        for (i10 = 8; 144 > i10; i10++) {
            Test.instanceCount <<= by;
            if (b) break;
            i12 = 1;
            while ((i12 += 2) < 12) {
                Test.dFld /= (i11 | 1);
                i11 ^= (int)l;
                i11 = i11;
                i11 <<= i10;
                Test.fFld *= 45L;
            }
            iArr2 = iArr2;
            Test.fFld -= i10;
            i9 += (((i10 * i11) + i12) - i12);
        }
        vMeth_check_sum += l + i9 + i10 + i11 + by + (b ? 1 : 0) + i12 + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i2=-35, i13=17625, i14=130, i15=0, i16=-1, i17=-25446, i18=-90, i19=-248, i20=201, i21=-52, iArr[]=new
            int[N];
        float f=-2.209F;
        double d=-1.64783;
        long l2=93L;

        FuzzerUtils.init(iArr, 6347);

        for (int smallinvoc=0; smallinvoc<900; smallinvoc++) vSmallMeth((int)((Test.instanceCount++) + iArr[(i2 >>> 1)
            % N]), -((i2 * i2) * (i2 += i2)));
        f = 1;
        do {
            vMeth(Test.instanceCount);
            i2 -= i2;
        } while (++f < 139);
        Test.fFld = -12;
        for (d = 3; d < 190; ++d) {
            for (i14 = 8; i14 < 134; i14++) {
                for (l2 = 1; l2 < 2; l2++) {
                    try {
                        i2 = (1344954974 / i13);
                        iArr[(int)(d + 1)] = (i16 % -100);
                        i15 = (iArr[(int)(l2)] % i2);
                    } catch (ArithmeticException a_e) {}
                }
                Test.lArrFld = FuzzerUtils.long1array(N, (long)-474812818L);
                i16 = (int)-13L;
                i2 = -9;
                for (i17 = 1; i17 < 2; i17++) {
                    i18 += (i17 | i16);
                    i16 += (int)Test.fFld;
                    Test.fFld *= f;
                    i2 += (((i17 * i16) + l2) - i15);
                    try {
                        i18 = (86 % i16);
                        i15 = (i13 / i18);
                        i16 = (-185 % i2);
                    } catch (ArithmeticException a_e) {}
                    i13 += (12 + (i17 * i17));
                    i15 -= i15;
                    i15 += i17;
                    i15 = i18;
                }
                i16 -= (int)Test.instanceCount;
                for (i19 = 1; i19 < 2; i19++) {
                    Test.instanceCount += i14;
                }
            }
            dArrFld[(int)(d - 1)] *= i15;
            i20 -= byFld;
            i15 -= (int)2804251804L;
            i20 = i21;
            Test.sFld += (short)(d + Test.fFld);
        }



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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth1 vMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
