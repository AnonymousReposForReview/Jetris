package tests.javafuzzer2039;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:49:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6226492613437026766L;
    public static int iFld=-31901;
    public float fFld=4.929F;
    public double dFld=-86.70996;
    public byte byFld=94;
    public byte byArrFld[]=new byte[N];
    public static volatile float fArrFld[]=new float[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.320F);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth() {

        byte by1=-48;
        float f1=-45.842F;
        int i5=0, i6=-217, i7=6, i8=-151, i9=37786, i10=-56, iArr1[]=new int[N];
        boolean b1=true;
        long l1=1716805291097570387L, lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 36024);
        FuzzerUtils.init(lArr, -8L);

        iArr1[(Test.iFld >>> 1) % N] -= by1;
        lArr[(Test.iFld >>> 1) % N] -= (long)f1;
        for (i5 = 11; i5 < 233; i5 += 3) {
            for (i7 = 21; i7 > 1; i7--) {
                Test.iFld += (-22579 + (i7 * i7));
                for (i9 = 1; i9 < 2; ++i9) {
                    if (b1) continue;
                    i10 += i9;
                    iArr1[i7] -= i5;
                }
                iArr1[i5] = i7;
                l1 = 2;
                do {
                    if (i5 != 0) {
                        return ((int)(by1 + Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + i9 + i10 + (b1 ? 1 : 0) + l1
                            + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr))) % 2 > 0;
                    }
                    i8 = i9;
                    by1 >>= (byte)i10;
                    if (false) break;
                } while (--l1 > 0);
            }
        }
        long meth_res = by1 + Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + i9 + i10 + (b1 ? 1 : 0) + l1 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth() {

        byte by=122;
        float f=-9.919F;
        int i1=144, i2=206, i3=-63930, i4=-6, i11=21, iArr[]=new int[N];
        boolean b=false, bArr[]=new boolean[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, 1);
        FuzzerUtils.init(dArr, 52.36073);
        FuzzerUtils.init(bArr, false);

        Test.instanceCount >>= (long)(Math.max(iArr[(14 >>> 1) % N], Test.iFld - by) + (++dArr[(Test.iFld >>> 1) % N]));
        f *= (Test.instanceCount ^= (--Test.instanceCount));
        for (i1 = 8; i1 < 166; ++i1) {
            for (i3 = 1; i3 < 10; ++i3) {
                try {
                    Test.iFld = (871128120 / i3);
                    i4 = (i3 / -19654);
                    i2 = (Test.iFld / i1);
                } catch (ArithmeticException a_e) {}
                by >>= (byte)((i2 -= Integer.reverseBytes(i2)) - ((++Test.instanceCount) * (i4 + Test.instanceCount)));
                if (bArr[i3] | (b = bMeth())) break;
                b = b;
                i4 <<= (int)-5L;
                Test.instanceCount += i2;
                i11 = 1;
                do {
                    Test.fArrFld[i1 - 1] = i4;
                    Test.iFld -= (int)Test.instanceCount;
                    Test.instanceCount *= i2;
                    Test.iFld = Test.iFld;
                } while (++i11 < 2);
            }
        }
        vMeth_check_sum += by + Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + (b ? 1 : 0) + i11 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(bArr);
    }

    public float fMeth(long l) {

        int i12=36068, i13=-63168, i14=-3234, i15=44305, i16=62, i17=-5219, i18=4, i19=-47, iArr2[]=new int[N];
        boolean b2=false;
        byte by2=-17;

        FuzzerUtils.init(iArr2, -26504);

        Test.iFld = 3;
        vMeth();
        iArr2 = iArr2;
        for (i12 = 236; 5 < i12; --i12) {
            Test.iFld += i12;
            if (b2) continue;
            try {
                i13 = (-40698 / i12);
                Test.iFld = (iArr2[i12] % -1727555876);
                Test.iFld = (i12 / Test.iFld);
            } catch (ArithmeticException a_e) {}
            for (i14 = 1; i14 < 7; i14++) {
                for (i16 = 1; i16 < 2; i16++) {
                    Test.iFld += (i16 * i16);
                }
                i15 += (6 + (i14 * i14));
                for (i18 = 1; i18 < 2; ++i18) {
                    iArr2[i18] = by2;
                    by2 += (byte)(((i18 * i15) + i13) - i17);
                    Test.instanceCount = Test.instanceCount;
                }
            }
        }
        long meth_res = l + i12 + i13 + (b2 ? 1 : 0) + i14 + i15 + i16 + i17 + i18 + i19 + by2 +
            FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s=28154, sArr[]=new short[N];
        int i=3, i20=-1, i21=241, i22=-151, i23=-199, i24=-143, iArr3[]=new int[N];
        boolean b3=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -50L);
        FuzzerUtils.init(iArr3, 18);
        FuzzerUtils.init(sArr, (short)-13769);

        Test.instanceCount = (((-52388 * Math.min(56339, 13332)) + (s + -54579)) << byArrFld[(i >>> 1) % N]);
        i = (int)(fMeth(Test.instanceCount) * fFld);
        i20 = 1;
        do {
            if (b3) continue;
            for (i21 = 11; 285 > i21; ++i21) {
                i22 -= i21;
                Test.iFld = i20;
                if (b3) {
                    for (i23 = 1; i23 < 2; ++i23) {
                        dFld += byFld;
                        lArr1[i20 + 1] += (long)dFld;
                        i += (i23 - byFld);
                        b3 = b3;
                        iArr3[i23] <<= i22;
                        i22 = i22;
                        switch ((i20 % 6) + 31) {
                        case 31:
                            b3 = b3;
                            break;
                        case 32:
                            i24 = (int)Test.instanceCount;
                            Test.iFld += (int)dFld;
                            iArrFld[i20 - 1] -= i20;
                            Test.iFld = i24;
                            break;
                        case 33:
                            fFld -= Test.instanceCount;
                            iArr3[i20] += (int)Test.instanceCount;
                            sArr[i21 + 1] -= (short)200;
                            Test.fArrFld[i20] = Test.iFld;
                            break;
                        case 34:
                            iArrFld[i21 + 1] = (int)1849830213667750791L;
                            Test.iFld += (((i23 * fFld) + i22) - i20);
                            Test.instanceCount += (((i23 * Test.instanceCount) + i22) - Test.instanceCount);
                            break;
                        case 35:
                            Test.iFld >>>= (int)1438508712L;
                            i = i20;
                        case 36:
                            Test.iFld = (int)dFld;
                            break;
                        }
                    }
                } else if (b3) {
                    Test.iFld = Test.iFld;
                }
            }
        } while ((i20 += 3) < 264);


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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  bMeth ->  bMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
