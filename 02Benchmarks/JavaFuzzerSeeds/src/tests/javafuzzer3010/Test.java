package tests.javafuzzer3010;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:45:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5L;
    public static int iFld=158;
    public static byte byFld=-62;
    public static double dFld=-80.12726;
    public short sFld=-25770;
    public volatile long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f) {

        int i2=14, i3=-1, i4=33464, i5=-9, i6=-103, iArr1[]=new int[N];
        double d=-11.66506;
        boolean b=true;

        FuzzerUtils.init(iArr1, 62748);

        i2 = 1;
        do {
            Test.iFld += Test.byFld;
            try {
                i3 = (i3 % iArr1[(Test.iFld >>> 1) % N]);
                Test.iFld = (i3 % 171);
                iArr1[i2] = (-49568 % i2);
            } catch (ArithmeticException a_e) {}
            for (i4 = 1; 7 > i4; i4++) {
                if (b) {
                    d -= 2.49723;
                    d = Test.instanceCount;
                } else if (b) {
                    if (i4 != 0) {
                        vMeth1_check_sum += Float.floatToIntBits(f) + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) +
                            i6 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    i6 = 1;
                    while (++i6 < 2) {
                        iArr1[i6 + 1] += (int)Test.instanceCount;
                        Test.iFld |= Test.iFld;
                        i5 -= (int)f;
                        Test.instanceCount += (long)(-1.45F + (i6 * i6));
                        i5 += (((i6 * Test.byFld) + i2) - Test.iFld);
                        f = i2;
                    }
                    vMeth1_check_sum += Float.floatToIntBits(f) + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 +
                        (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
                    return;
                } else {
                    iArr1[i4] = i5;
                }
            }
        } while (++i2 < 228);
        vMeth1_check_sum += Float.floatToIntBits(f) + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + (b ? 1 : 0)
            + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        int i1=58476, i8=4924, i9=3547, i10=-39355, i11=5, iArr[]=new int[N];
        float f1=108.289F;

        FuzzerUtils.init(iArr, -19303);

        i1 = 1;
        while ((i1 += 3) < 273) {
            iArr = (iArr = (iArr = (iArr = iArr)));
            Test.byFld += (byte)(i1 * i1);
            Test.iFld = Test.byFld;
            vMeth1(68.876F);
            iArr = iArr;
            Test.iFld = Test.iFld;
        }
        for (i8 = 4; i8 < 145; i8++) {
            i10 = 1;
            while (++i10 < 11) {
                Test.iFld -= i11;
                Test.iFld -= Test.byFld;
                i9 *= (int)f1;
                f1 += (i10 * i10);
                i11 -= i10;
                Test.instanceCount = Test.byFld;
            }
        }
        long meth_res = i1 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        float f2=2.89F;
        boolean b1=false;
        int i12=-15, i13=11, i14=-686, i15=40779, iArr2[]=new int[N];
        long l=-93L, lArr[]=new long[N];
        short s=29105, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-29413);
        FuzzerUtils.init(iArr2, 174);
        FuzzerUtils.init(lArr, -14L);

        sArr[(Test.iFld >>> 1) % N] -= (short)Math.max(iMeth(), Test.iFld);
        Test.iFld = (int)f2;
        if (b1) {
            Test.instanceCount = Test.iFld;
            Test.iFld = 211;
        } else {
            Test.iFld = (int)f2;
            for (i12 = 152; i12 > 1; i12--) {
                iArr2[i12] >>= i13;
                Test.iFld += i12;
                i14 = 1;
                while (++i14 < 10) {
                    switch (((i12 >>> 1) % 9) + 70) {
                    case 70:
                        for (l = i14; l < 1; ++l) {
                            Test.instanceCount = Test.iFld;
                            i15 += (int)l;
                            s = (short)-33.856F;
                        }
                    case 71:
                        Test.dFld *= f2;
                        break;
                    case 72:
                        lArr[i14 - 1] -= i12;
                        break;
                    case 73:
                        i13 += (i14 * i14);
                        break;
                    case 74:
                        b1 = true;
                    case 75:
                        i13 <<= Test.byFld;
                        break;
                    case 76:
                        i15 = (int)Test.instanceCount;
                    case 77:
                        i15 |= i14;
                        break;
                    case 78:
                        Test.dFld *= Test.iFld;
                        break;
                    default:
                        b1 = false;
                    }
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f2) + (b1 ? 1 : 0) + i12 + i13 + i14 + l + i15 + s +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-1, i16=-3, i17=233, i18=4, i19=-6, i20=-188, i21=8, i22=-3, iArr3[]=new int[N];
        long l1=-74L;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr3, -1);
        FuzzerUtils.init(fArr, 0.111F);

        i = 1;
        while (++i < 354) {
            vMeth();
            Test.iFld -= (int)Test.instanceCount;
            lArrFld[i] = i;
        }
        l1 = 1;
        while ((l1 += 3) < 210) {
            Test.instanceCount = -45;
            Test.iFld = i;
            i16 = 358;
            do {
                iArr3 = FuzzerUtils.int1array(N, (int)-62685);
                Test.iFld = i;
                iArr3[i16 - 1] >>= i16;
                for (i17 = i16; i17 < 2; i17++) {
                    float f3=127.235F;
                    Test.iFld *= (int)Test.dFld;
                    sFld >>= (short)i;
                    Test.byFld -= (byte)f3;
                    f3 += (i17 * i17);
                    Test.iFld += Test.iFld;
                    Test.dFld *= -7L;
                    Test.instanceCount <<= Test.instanceCount;
                    fArr[i17 + 1] = f3;
                    try {
                        i18 = (iArr3[(int)(l1)] / i17);
                        iArr3[i17] = (i18 % 315865685);
                        Test.iFld = (24 % i);
                    } catch (ArithmeticException a_e) {}
                }
                i18 &= (int)l1;
            } while ((i16 -= 2) > 0);
            for (i19 = 7; i19 < 358; ++i19) {
                switch ((int)(((l1 % 2) * 5) + 39)) {
                case 49:
                    for (i21 = 2; i21 > 1; i21 -= 2) {
                        Test.instanceCount >>= i20;
                        i20 = i18;
                        iArr3[(int)(l1 - 1)] ^= (int)l1;
                        i20 += i18;
                    }
                    i22 /= 2;
                    break;
                case 45:
                    Test.iFld >>= -52;
                    break;
                }
            }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
